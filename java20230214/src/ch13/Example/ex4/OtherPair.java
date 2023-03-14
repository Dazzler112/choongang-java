package ch13.Example.ex4;

public class OtherPair<K, V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public V getValue() {
		return value;
	}
}
