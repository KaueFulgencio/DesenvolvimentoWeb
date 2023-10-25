package com.exercicioadapter;

public class ExercicioAdapter {

    public class Main {
        public static void main(String[] args) {
            Sistema sistema = new Sistema();
        
            sistema.setRelatorioStrategy(new RelatorioVendas());
            sistema.gerarRelatorio();
            sistema.gerarRelatorio();
        }
    }
}
