package com.example.JavaDev_HW15_SpringSecurity.noteprocessor.exceptions;

public class NoteProcessingExceptions extends Exception{
    public NoteProcessingExceptions(Long id){
        super("Note not found " + id );
    }
    public NoteProcessingExceptions(){
        super("Note not found ");
    }
}
