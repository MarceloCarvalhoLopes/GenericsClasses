package br.com.marcelocarvalho.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Map<K, V> {

	/**
	 * list of keys
	 */
	private List<K> keys = new ArrayList<>();

	/**
	 * list of values
	 */
	private List<V> values = new ArrayList<>();

	
	/**
	 * Insere um par de chave e valor. Se a chave que est� sendo inserida j� existe, o c�digo atualiza o valor 
	 * que corresponde � chave j� existente (n�o insere a chave novamente).
	 * @param key Chave a ser inserida.
	 * @param value Valor associado � chave.
	 * @return True se a chave n�o existia anteriormente; false, caso contr�rio.
	 */
	public boolean put(K key, V value) {

		if (keys.contains(key)) {
			int index = getKeyIndex(key);
			
			// Define o novo valor na lista de valores, no mesmo �ndice da chave encontrada
			values.set(index, value);

			// Retorna false porque a chave j� existia
			return false;
		}else {
			// Adiciona a chave na lista de chaves
			keys.add(key);

			// Adiciona o valor na lista de valores
			values.add(value);

			// Retorna true porque a chave n�o existia anteriormente
			return true;	
		}
			

		
	}

	/**
	 * Obt�m o valor associado a uma chave.
	 * 
	 * @param key Chave para buscar.
	 * @return Valor associado � chave. Se a chave n�o for encontrada, retorna null.
	 */
	public V get(K key) {
		int index = getKeyIndex(key);

		if (index < 0) {
			return null;
		}

		return values.get(index);

	}

	/**
	 * Retorna o �ndice da lista para uma determinada chave
	 * 
	 * @param key Chave para procurar
	 * @return �ndice na lista que corresponde � chave. Se a chave n�o existir,
	 *         retorna -1.
	 */

	private int getKeyIndex(K key) {

		for (int i = 0; i < keys.size(); i++) {
			K k = keys.get(i);

			if (k.equals(key)) {
				return i;
			}

		}

		return -1;

	}

	/**
	 * Remove os itens armazenados por esta classe.
	 */
	public void clear() {
		//Clean the keys
		keys.clear();
		
		//Clean the values		
		values.clear();
	}
}
