package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory { //Criação da "fabrica"

    /*A classe vai expor um metodo que retorna o tipo da interface
    mais internamente vai expor uma implementação = 
    usado para não precisar expor a implimentação, deixando somente a interface
    */
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
    
}
