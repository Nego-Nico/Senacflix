package br.com.motta.senacflix.Janelas;

import javax.swing.table.DefaultTableModel;

public class TabelaEditavel extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int column) {
        // Permita a edição de todas as células
        return true;
    }

}
