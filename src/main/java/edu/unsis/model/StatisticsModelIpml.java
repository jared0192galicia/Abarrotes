/**
 * Autor: Galicia Cordova Elietzer Jared
 * Creado el: 19 / Jun / 2023
 * modificado: 19 / Jun / 2023
 * Descipciòn: Implementacion del CRUD basico en mysql para productos
 */
package edu.unsis.model;

import edu.unsis.dao.CRUD;
import edu.unsis.dao.SaleDAOImpl;

public class StatisticsModelIpml implements IStatisticsModel {

    private CRUD dao = new SaleDAOImpl();
}
