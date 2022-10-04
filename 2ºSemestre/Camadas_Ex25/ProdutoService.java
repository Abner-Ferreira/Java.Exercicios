package Camadas_Ex25;
 
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class ProdutoService {
    public static void InserirProduto(Produto p) throws SQLException {  
    	String query = "select max(id) as id from tb_produto";
    	int id = 0;
    	ResultSet rs = Dao.SelectCommand(query);
    	while(rs.next()){
        	id = rs.getInt("id");
         }
        id ++;
    	
    	
        query = String.format("insert into tb_produto (id,nome,preco,quantidade) values(%s,'%s',%s,%s)",id, p.getNome(), p.getPreco(), p.getQuantidade());
        Dao.InsertUpdateDeleteCommand(query);
    }
   
    public static void AtualizarProduto(Produto p) {
        String query = String.format("update tb_produto set nome = '%s', preco = %s, quantidade = %s where id = %s", p.getNome(), p.getPreco(), p.getQuantidade(),p.getId());
        Dao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExcluirProduto(int id) {
        String query = String.format("delete from tb_produto where id = %s", id);
        Dao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExibirProdutos() {
        String query= "select * from tb_produto order by id";
       
        ResultSet rs = Dao.SelectCommand(query);
       
        try {
            while(rs.next()){
                System.out.println("ID: "+rs.getString("id"));
                System.out.println("NOME: "+rs.getString("nome"));
                System.out.println("PREÇO: "+rs.getString("preco"));
                System.out.println("QUANTIDADE DE ESTOQUE: "+rs.getString("quantidade") + "\n");
            }
        }
        catch (Exception e){
                System.out.println(e);
        }  
    }
   
    public static void ExibirProduto(int id) {
        String query = String.format("select * from tb_produto where id = %s", id);
        ResultSet rs = Dao.SelectCommand(query);
       
        try {
            while(rs.next()){
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("preco"));
                System.out.println(rs.getString("quantidade"));
            }
        }
        catch (Exception e){
                System.out.println(e);
        }
    }
 
}
