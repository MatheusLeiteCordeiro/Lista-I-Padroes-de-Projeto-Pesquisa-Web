public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        // Ajuste manual: filtro de 'friend' case-insensitive.
        model.addQueryObserver(
            query -> System.out.println("Oh Yes! " + query),
            query -> query.toLowerCase().contains("friend")
        );

        // Ajuste manual: 'mais de 60' é > 60, não >= 60.
        model.addQueryObserver(
            query -> System.out.println("So long " + query),
            query -> query.length() > 60
        );
    }
}