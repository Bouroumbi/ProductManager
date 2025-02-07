package com.example.productmanager.controller;

import com.example.productmanager.dto.CategoryDTO;
import com.example.productmanager.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
@Tag(name = "Categories", description = "Endpoints pour la gestion des categories")

public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    @Operation(summary = "Récupérer toutes les catégories", description = "Retourne la liste de toutes les catégories")
    public ResponseEntity<List<CategoryDTO>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

}
