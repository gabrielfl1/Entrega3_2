package Exercicio71;

public class ManipuladorDuplicar extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		return string + " " + string;
	}
}
