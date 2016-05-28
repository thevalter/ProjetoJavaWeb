
package DAO;

import Bean.Pessoa;
import java.util.List;


public interface PessoaDao {
    
    public boolean insert(Pessoa pessoa);
    public void remove (int id);
    public List<Pessoa> list();
    public Pessoa search(int id);
    public void edit(Pessoa pessoa);
        
}
