package com.appliedscience.api.domain.services;

import com.appliedscience.api.data.entities.Canvas;
import com.appliedscience.api.data.entities.Sharepoint;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CanvasService {
    Page<Canvas> findAll(Pageable pageable);
    Optional<Canvas> findById(String id);
    Optional<Canvas> findByUsername(String name);
    Canvas save(Canvas projectToSave);
    void delete(String id);
}
