/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.ListaCPDto;

/**
 *
 * @author Valerio
 */
public interface GestioneCPService {

    ListaCPDto add(String codice);

    ListaCPDto delete(String codice);

    ListaCPDto edit(String codice);

}
