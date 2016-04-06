package persistencia;

import java.util.List;

public interface DAO<T> {
	
	public void insert(T objeto);
	
	public void delete(T objeto);
	
	public List<T> select();
	
	public void update(T antigo, T novo);

}
