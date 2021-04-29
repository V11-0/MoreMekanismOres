package com.rcldevelop.moremekanismores.models;

// Helper class to generate item ids with ore name
public class OreMekanismComponents {

    private String oreName;
    private String[] oreProcessPhases;
    private String[] oreSlurries;
    private int[] slurriesColors;
    
    public OreMekanismComponents(String oreName, int[] slurriesColors) {
        this.oreName = oreName;
        this.slurriesColors = slurriesColors;

        oreProcessPhases = new String[] {
            "crystal_" + oreName,
            "shard_" + oreName,
            "clump_" + oreName,
            "dirty_dust_" + oreName,
            "dust_" + oreName
        };

        oreSlurries = new String[] {
            "dirty_" + oreName,
            "clean_" + oreName
        };
    }

    public String getOreName() {
        return oreName;
    }

    public String[] getOreProcessPhases() {
        return oreProcessPhases;
    }

    public String[] getSlurries() {
        return oreSlurries;
    }

    public int[] getSlurriesColors() {
        return slurriesColors;
    }
}