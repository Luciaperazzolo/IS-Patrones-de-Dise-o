package Builder;

public class Director {
    public Computadora construirComputadoraGaming(ComputadoraBuilder builder) {
        return builder
            .procesador("Intel i7")
            .ram(32)
            .almacenamiento("1TB SSD")
            .placaVideo("RTX 4070")
            .sistemaOperativo("Windows 11")
            .wifi(true)
            .bluetooth(true)
            .build();
    }

    public Computadora construirComputadoraOficina(ComputadoraBuilder builder) {
        return builder
            .procesador("Intel i5")
            .ram(16)
            .almacenamiento("512GB SSD")
            .placaVideo("Gráficos integrados")
            .sistemaOperativo("Windows 11")
            .wifi(true)
            .bluetooth(true)
            .build();
    }
}
