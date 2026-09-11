import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoComBD {
    public static Connection obterConexao() throws RuntimeException {
        Properties propriedades = new Properties();
        // carrega o arquivo .properties e verifica se o arquivo existe
        try (InputStream arquivo = ConexaoComBD.class.getClassLoader().getResourceAsStream("BD.properties")) {
            if (arquivo == null) {
                Exception e = new Exception("Arquivo não encontrado!");
                throw new RuntimeException(e);
            }
            propriedades.load(arquivo);
            // faz conexão acessando url, usuario e senha, sem deixar dados sensiveis expostos
            return DriverManager.getConnection(propriedades.getProperty("db.url"), propriedades.getProperty("db.usuario"),
                    propriedades.getProperty("db.senha"));
        } catch (SQLException | IOException e) {
            // se falhar, informa e para a execução
            throw new RuntimeException(e);
        }
    }
}
