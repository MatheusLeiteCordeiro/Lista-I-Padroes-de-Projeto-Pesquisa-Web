import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WebSearchModel {
    private final File sourceFile;
    private final List<ObserverEntry> observers = new ArrayList<>();

    public interface QueryObserver {
        void onQuery(String query);
    }

    private static class ObserverEntry {
        private final QueryObserver observer;
        private final QueryFilter filter;

        ObserverEntry(QueryObserver observer, QueryFilter filter) {
            this.observer = observer;
            this.filter = filter;
        }

        boolean interessa(String consulta) {
            return filter.matches(consulta);
        }

        void notificar(String consulta) {
            observer.onQuery(consulta);
        }
    }

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                notifyAllObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addQueryObserver(QueryObserver queryObserver, QueryFilter queryFilter) {
        observers.add(new ObserverEntry(queryObserver, queryFilter));
    }

  private void notifyAllObservers(String line) {
    for (ObserverEntry entry : observers) {
        if (entry.interessa(line)) {
            entry.notificar(line);
        }
    }
}
}