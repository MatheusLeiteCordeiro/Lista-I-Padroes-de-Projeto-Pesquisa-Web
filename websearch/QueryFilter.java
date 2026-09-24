public class QueryFilter {
    
}
/**
 * Estratégia de filtro de consulta.
 * O modelo de busca só conhece esta interface, nunca as implementações.
 */
public interface QueryFilter {
    /**
     * @param consulta a linha lida do arquivo
     * @return true se o observador associado deve ser notificado
     */
    boolean matches(String consulta);
}