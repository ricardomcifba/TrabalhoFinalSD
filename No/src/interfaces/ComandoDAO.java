/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import blockchain.Block;


/**
 *
 * @author Aluno
 */
public interface ComandoDAO {

    public void comando (String comando) throws Exception;
//    public void insertBC(Block block)  throws Exception;
}
