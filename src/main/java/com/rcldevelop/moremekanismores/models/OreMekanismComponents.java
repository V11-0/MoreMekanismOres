package com.rcldevelop.moremekanismores.models;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Helper class to generate item ids with ore name
 */
public class OreMekanismComponents {

    public enum Phase {
        CRYSTAL,
        SHARD,
        CLUMP,
        DIRTY_DUST,
        DUST
    }

    private String oreName;
    private String[] oreProcessPhases;
    private String[] oreSlurries;
    private int[] slurriesColors;
    
    /**
     * @param oreName name of ore
     * @param slurriesColors array of two ints with colors of slurrie, dirty and clean, respectively
     */
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

    /**
     * @param oreName name of ore
     * @param slurriesColors array of two ints with colors of slurrie, dirty and clean, respectively
     * @param excludedPhases Phase enum with the item or items to not be registered
     */
    public OreMekanismComponents(String oreName, int[] slurriesColors, Phase... excludedPhases) {
        this(oreName, slurriesColors);

        for (Phase excludePhase : excludedPhases) {
            oreProcessPhases[excludePhase.ordinal()] = null;
        }

        // Sort Array passing the null positions to the end of Array
        Arrays.sort(oreProcessPhases, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
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