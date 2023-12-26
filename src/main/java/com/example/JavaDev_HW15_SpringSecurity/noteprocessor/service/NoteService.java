package com.example.JavaDev_HW15_SpringSecurity.noteprocessor.service;

import com.example.JavaDev_HW15_SpringSecurity.noteprocessor.entities.Note;
import com.example.JavaDev_HW15_SpringSecurity.noteprocessor.exceptions.NoteProcessingExceptions;
import com.example.JavaDev_HW15_SpringSecurity.noteprocessor.repository.NoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NoteService implements NoteServiceInterface{
    private NoteRepository noteRepository;

    @Override
    public List<Note> listAll() {
        return noteRepository.findAll();
    }

    @Override
    public Note add(Note note) throws NoteProcessingExceptions {
        if(note == null){
            throw new NoteProcessingExceptions();
        }
        return noteRepository.save(note);
    }

    @Override
    public void deleteById(Long id) throws NoteProcessingExceptions {
        if(noteRepository.existsById(id)){
            noteRepository.deleteById(id);
        }else{
            throw new NoteProcessingExceptions(id);
        }
    }

    @Override
    public void update(Note note) throws NoteProcessingExceptions {
        Long id = note.getId();
        if(noteRepository.existsById(id)){
            note.setId(id);
            noteRepository.save(note);
        }else {
            throw new NoteProcessingExceptions(id);
        }
    }

    @Override
    public Note getById(Long id) throws NoteProcessingExceptions {
        return noteRepository.findById(id)
                .orElseThrow(()-> new NoteProcessingExceptions(id));
    }
}
