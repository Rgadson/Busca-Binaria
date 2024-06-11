package Negocio;


import java.util.Arrays;

import Modelo.BuscaBinariaModelo;
import Visao.BuscaBinariaVisao;

public class BuscaBinariaNegocio {
	
	private BuscaBinariaModelo modelo;
    private BuscaBinariaVisao visao;

    public BuscaBinariaNegocio() {
        this.modelo = new BuscaBinariaModelo();
        this.visao = new BuscaBinariaVisao();
    }

    public void buscar(int[] array, int numeroParaEncontrar) {
        Arrays.sort(array);
        int resultado = modelo.buscaBinaria(array, numeroParaEncontrar);
        visao.mostrarResultado(numeroParaEncontrar, resultado);
    }
}