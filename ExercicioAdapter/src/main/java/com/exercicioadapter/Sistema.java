package com.exercicioadapter;

class Sistema {
    private RelatorioStrategy relatorioStrategy;

    public void setRelatorioStrategy(RelatorioStrategy relatorioStrategy) {
        this.relatorioStrategy = relatorioStrategy;
    }

    public void gerarRelatorio() {
        if (relatorioStrategy != null) {
            relatorioStrategy.gerarRelatorio();
        } else {
            System.out.println("Nenhum relatório foi selecionado.");
        }
    }
}
