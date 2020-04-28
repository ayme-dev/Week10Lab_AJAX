/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.Date;
import models.Note;
import java.util.List;
import dataaccess.NoteDB;

/**
 *
 * @author aymen
 */
public class NoteService {
    private NoteDB noteDB;

    public NoteService() {
        noteDB = new NoteDB();
    }

//    public Note get(String title) throws Exception {
//        return notesDB.getTitle(title);
//    }

    public List<Note> getAll() throws Exception {
        return noteDB.getAll();
    }

//    public int update(String title, String contents) throws Exception {
//        Note note = get(title);
//        note.setTitle(title);
//        note.setContents(contents);
//        return noteDB.update(note);
//    }

//    public int delete(String title) throws Exception {
//        Note deletedNote = noteDB.getNote(title);
//        return noteDB.delete(deletedNote);
//    }

//    public int insert(Integer noteid, Date datecreated, String title, String contents) throws Exception {
//        Note note = new Note (noteid, datecreated, title, contents);
//        note.setTitle(title);
//        note.setContents(contents);
//        return noteDB.insert(note);
//    }
}
