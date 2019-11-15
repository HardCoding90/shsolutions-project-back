package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.ProductosProveedores;
import com.shsolutions.project.dominio.repositorios.ProductosProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/productosProveedores")
public class ProductosProveedoresController {

    @Autowired
    private ProductosProveedoresRepository productosProveedoresRepository;

    @GetMapping("/findAll")
    List<ProductosProveedores> findAll() {
        return productosProveedoresRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<ProductosProveedores> findAllEnabled() {
        return productosProveedoresRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    ProductosProveedores findById(@PathVariable Integer id) {
        return productosProveedoresRepository.findById(id).orElse(null);
    }

    @GetMapping("/proveedor/{idProveedor}")
    List<ProductosProveedores> findByProveedor(@PathVariable Integer idProveedor) {
        return productosProveedoresRepository.findAllByIndicadorHabilitadoTrueAndIdProveedor(idProveedor);
    }

    @PostMapping("/saveAll/{id}")
    List<ProductosProveedores> save(@RequestBody List<ProductosProveedores> productosProveedoresList,@PathVariable Integer id) {
        List<ProductosProveedores> productosProveedores = productosProveedoresRepository.findAllByIdProveedorAndIndicadorHabilitadoIsTrue(id);
        if(!productosProveedores.isEmpty()){
            productosProveedores.forEach(x -> x.setIndicadorHabilitado(false));
            productosProveedoresRepository.saveAll(productosProveedores);
        }
        productosProveedores.clear();
        if(!productosProveedoresList.isEmpty()){
            ProductosProveedores prpro = null;
            for(ProductosProveedores pr: productosProveedoresList){
                prpro = productosProveedoresRepository.findByIdProductoAndIdProveedor(pr.getIdProducto(),pr.getIdProveedor());
                if(prpro != null){
                    pr.setIdProductoProveedor(prpro.getIdProductoProveedor());
                    pr.setIndicadorHabilitado(true);
                    prpro = null;
                }
                productosProveedores.add(pr);
            }
        }
        return  productosProveedoresRepository.saveAll(productosProveedores);
    }

    @PostMapping()
    ProductosProveedores save(@RequestBody ProductosProveedores productosProveedores) {
        return productosProveedoresRepository.save(productosProveedores);
    }
}
