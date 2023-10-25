package com.exercicioadapter;

class RelatorioVendas implements RelatorioStrategy {
    @Override
    public void gerarRelatorio() {
        // Implementação para gerar relatório de vendas
        System.out.println("Relatório de Vendas gerado.");
    }
}

class RelatorioJARAdapter implements RelatorioStrategy {
    private RelatorioVendas relatorioJAR;

    public RelatorioJARAdapter(RelatorioVendas relatorioJAR) {
        this.relatorioJAR = relatorioJAR;
    }

    @Override
    public void gerarRelatorio() {
    }
}
