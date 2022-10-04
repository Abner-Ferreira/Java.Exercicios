package Service;
 
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Clientes;
import dao.Dao;
 

public class ContaService {
    public static void InserirCliente(Clientes c) throws SQLException {  
    	String query = "select max(id) as id from tb_cliente";
    	int id = 0;
    	ResultSet rs = Dao.SelectCommand(query);
    	while(rs.next()){
        	id = rs.getInt("id");
         }
        id ++;
    	
    	
        query = String.format("insert into tb_cliente (id,nome,idade,email) values(%s,'%s',%s,'%s')",id, c.getNome(), c.getIdade(), c.getEmail());
        Dao.InsertUpdateDeleteCommand(query);
    }
   
    public static void AtualizarCliente(Clientes c) {
        String query = String.format("update tb_cliente set nome = '%s', idade = %s, email = '%s' where id = %s",c.getNome(), c.getIdade(), c.getEmail());
        Dao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExcluirCliente(int id) {
        String query = String.format("delete from tb_clientewhere id = %s", id);
        Dao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExibirCliente() {
        String query= "select * from tb_cliente order by id";
       
        ResultSet rs = Dao.SelectCommand(query);
       
        try {
            while(rs.next()){
                System.out.println("ID: "+rs.getString("id"));
                System.out.println("NOME: "+rs.getString("nome"));
                System.out.println("IDADE: "+rs.getString("idade"));
                System.out.println("EMAIL: "+rs.getString("email") + "\n");
            }
        }
        catch (Exception e){
                System.out.println(e);
        }  
    }
   
    public static void ExibirCliente(int id) {
        String query = String.format("select * from tb_cliente where id = %s", id);
        ResultSet rs = Dao.SelectCommand(query);
       
        try {
            while(rs.next()){
            	 System.out.println(rs.getString("id"));
                 System.out.println(rs.getString("nome"));
                 System.out.println(rs.getString("idade"));
                 System.out.println(rs.getString("email"));
            }
        }
        catch (Exception e){
                System.out.println(e);
        }
    }
 
}
