package br.com.magna.entidades;

public enum GeneroEnum{
    MASCULINO(1), FEMININO(2);
    
    private final int genero;
    GeneroEnum(int i) {
		genero = i;
	}
    public int MeuGenero() {
    	return this.genero;
    }
	
}
