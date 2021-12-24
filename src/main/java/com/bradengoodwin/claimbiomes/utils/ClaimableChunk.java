package com.bradengoodwin.claimbiomes.utils;

import org.bukkit.Chunk;

public class ClaimableChunk {
    private Chunk chunk, north, south, east, west;

    public ClaimableChunk(Chunk chunk){
        this.chunk = chunk;
    }

    public Chunk getChunk(){
        return this.chunk;
    }

    public Chunk getNorth(){
        return this.north;
    }

    public Chunk getSouth() {
        return this.south;
    }

    public Chunk getEast() {
        return this.east;
    }

    public Chunk getWest() {
        return this.west;
    }
}
