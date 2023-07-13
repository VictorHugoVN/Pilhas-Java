package pilhaComDeque;

import java.util.ArrayDeque;
import java.util.Deque;
public class PilhaComDeque {
	
	public static void main(String[] args) {
		
		
		Deque<String> pilha = new ArrayDeque<>();
		
		//Adicionando elemento na pilha
		pilha.push("apple");
		pilha.push("orange");
		pilha.push("pear");
		
		
		System.out.println("Pilha = " + pilha);
		
		System.out.println("Pilha.peek() = " + pilha.peek()); //Retorna o último elemento sem removê-lo
		System.out.println("Pilha.empty() = " + pilha.isEmpty()); //Verifica se a pilha está vazia
		
		
		
	}

}
