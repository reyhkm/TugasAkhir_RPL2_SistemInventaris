package com.mycompany.proyekinventaris;

import com.mycompany.proyekinventaris.service.BarangService;
import com.mycompany.proyekinventaris.view.InventarisView;
import java.awt.EventQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AplikasiInventaris implements CommandLineRunner {

    @Autowired
    private BarangService barangService;

    public static void main(String[] args) {
        new SpringApplicationBuilder(AplikasiInventaris.class)
                .headless(false)
                .run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        EventQueue.invokeLater(() -> {
            InventarisView view = new InventarisView(barangService);
            view.setVisible(true);
        });
    }
}
