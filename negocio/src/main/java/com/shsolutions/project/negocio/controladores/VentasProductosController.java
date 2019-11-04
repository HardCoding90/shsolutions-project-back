package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Inventarios;
import com.shsolutions.project.negocio.modelos.VentasProductos;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/ventasProductos")
public class VentasProductosController {

    private final String DOMAIN_URL = DOMAIN + "ventasProductos";
    private final String DOMAIN_URL_INVENTARIOS = DOMAIN + "inventarios";

    @GetMapping("/cascaron")
    VentasProductos cascaron() {
        return new VentasProductos();
    }

    @GetMapping("/findAll")
    List<VentasProductos> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", VentasProductos[].class));
    }

    @GetMapping("/findAll/enabled")
    List<VentasProductos> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", VentasProductos[].class));
    }

    @GetMapping("/findById/{id}")
    VentasProductos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, VentasProductos.class);
    }

    @PostMapping("/saveAll")
    List<VentasProductos> saveAll(@RequestBody List<VentasProductos> ventasProductos) {
        List<Inventarios> inventariosListActualizado = new ArrayList<>();
        Optional<Inventarios> inventarios;
        Inventarios inventario;
        ventasProductos =  Arrays.asList(restTemplate.postForObject(DOMAIN_URL + "/saveAll", ventasProductos, VentasProductos[].class));
        List<Inventarios> inventariosList = Arrays.asList(restTemplate.postForObject(DOMAIN_URL_INVENTARIOS + "/idsList",ventasProductos.stream()
                .map(VentasProductos::getIdInventario).collect(Collectors.toSet()),Inventarios[].class));
        for(VentasProductos vp : ventasProductos){
            inventarios = inventariosList.stream().filter(x -> x.getIdInventario() != null && x.getIdInventario().equals(vp.getIdInventario())).findFirst();
            if(inventarios.isPresent()){
                inventario = inventarios.get();
                inventario.setCantidadExistente(inventario.getCantidadExistente() - vp.getCantidadVendida());
                inventariosListActualizado.add(inventario);
            }
        }
        restTemplate.postForObject(DOMAIN_URL_INVENTARIOS + "/saveAll", inventariosListActualizado,Void.class);
        return ventasProductos;
    }

    @PostMapping()
    VentasProductos save(@RequestBody VentasProductos ventasProductos) {
        return restTemplate.postForObject(DOMAIN_URL, ventasProductos, VentasProductos.class);
    }

    @PutMapping()
    VentasProductos update(@RequestBody VentasProductos ventasProductos) {
        return restTemplate.postForObject(DOMAIN_URL, ventasProductos, VentasProductos.class);
    }
}
