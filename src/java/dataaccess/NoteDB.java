/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import models.Note;

/**
 *
 * @author aymen
 */
public class NoteDB {
    public List<Note> getAll() throws NotesDBException {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        try {
            List<Note> notes = em.createNamedQuery("User.findAll", Note.class).getResultList();
            return notes;                
        } finally {
            em.close();
        }
    }   
}
