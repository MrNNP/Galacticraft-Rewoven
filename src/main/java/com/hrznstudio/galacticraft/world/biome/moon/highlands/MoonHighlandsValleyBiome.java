/*
 * Copyright (c) 2020 HRZN LTD
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.hrznstudio.galacticraft.world.biome.moon.highlands;

import com.hrznstudio.galacticraft.world.gen.surfacebuilder.GalacticraftSurfaceBuilders;
import net.minecraft.world.biome.BiomeEffects;

public final class MoonHighlandsValleyBiome extends MoonHighlandsBiome {
    public MoonHighlandsValleyBiome() {
        super(new Settings()
                .configureSurfaceBuilder(GalacticraftSurfaceBuilders.MOON_SURFACE_BUILDER.method_30478(MoonHighlandsRocksBiome.MOON_HIGHLANDS_ROCK_CONFIG))
                .precipitation(Precipitation.NONE)
                .category(Category.NONE)
                .depth(-0.5F)
                .scale(0.03F)
                .temperature(-1000.0F)
                .downfall(0.005F)
                .effects(new BiomeEffects.Builder()
                        .waterColor(9937330)
                        .waterFogColor(11243183)
                        .fogColor(0)
                        .build())
                .parent(null)
        );
    }

}
