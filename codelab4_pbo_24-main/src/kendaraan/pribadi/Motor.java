package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    @Override
    public void Start() {
        System.out.println("Menyalakan " + " motor " + this.getName() );
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan motor " + this.getName());
    }

    @Override
    public void Brake() {
        System.out.println("Motor berhenti");
    }
}
