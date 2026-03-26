package io.github.giannihonda.springarchitecture.automaker.configuration;

import io.github.giannihonda.springarchitecture.automaker.Engine;
import io.github.giannihonda.springarchitecture.automaker.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutomakerConfiguration {

    @Bean(name = "engineVacuum")
    public Engine engineVacuum() {
        var engine = new Engine();
        engine.setHorsePower(120);
        engine.setCylinders(4);
        engine.setModel("XPTO-0");
        engine.setLiterage(2.0);
        engine.setType(EngineType.VACUUM);
        return  engine;
    }

    @Bean(name = "engineElectric")
    public Engine engineElectric() {
        var engine = new Engine();
        engine.setHorsePower(110);
        engine.setCylinders(3);
        engine.setModel("TH-10");
        engine.setLiterage(1.4);
        engine.setType(EngineType.ELECTRIC);
        return  engine;
    }

    @Bean(name = "engineTurbo")
    public Engine engineTurbo() {
        var engine = new Engine();
        engine.setHorsePower(180);
        engine.setCylinders(4);
        engine.setModel("XPTO-01");
        engine.setLiterage(1.5);
        engine.setType(EngineType.TURBO);
        return  engine;
    }
}
