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
	 * Insere um par de chave e valor. Se a chave que está sendo inserida já existe, o código atualiza o valor 
	 * que corresponde à chave já existente (não insere a chave novamente).
	 * @param key Chave a ser inserida.
	 * @param value Valor associado à chave.
	 * @return True se a chave não existia anteriormente; false, caso contrário.
	 */
	public boolean put(K key, V value) {

		if (keys.contains(key)) {
			int index = getKeyIndex(key);
			
			// Define o novo valor na lista de valores, no mesmo índice da chave encontrada
			values.set(index, value);

			// Retorna false porque a chave já existia
			return false;
		}else {
			// Adiciona a chave na lista de chaves
			keys.add(key);

			// Adiciona o valor na lista de valores
			values.add(value);

			// Retorna true porque a chave não existia anteriormente
			return true;	
		}
			

		
	}

	/**
	 * Obtém o valor associado a uma chave.
	 * 
	 * @param key Chave para buscar.
	 * @return Valor associado à chave. Se a chave não for encontrada, retorna null.
	 */
	public V get(K key) {
		int index = getKeyIndex(key);

		if (index < 0) {
			return null;
		}

		return values.get(index);

	}

	/**
	 * Retorna o índice da lista para uma determinada chave
	 * 
	 * @param key Chave para procurar
	 * @return Índice na lista que corresponde à chave. Se a chave não existir,
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
