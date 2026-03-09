package model;
import java.util.List;
import java.util.Map;

@lombok.Data
public class Pokemon {
    private List<Ability> abilities;
    private long baseExperience;
    private Cries cries;
    private List<Species> forms;
    private List<GameIndex> gameIndices;
    private long height;
    private List<HeldItem> heldItems;
    private long id;
    private boolean isDefault;
    private String locationAreaEncounters;
    private List<Move> moves;
    private String name;
    private long order;
    private List<PastAbility> pastAbilities;
    private List<PastStat> pastStats;
    private List<Object> pastTypes;
    private Species species;
    private Sprites sprites;
    private List<Stat> stats;
    private List<Type> types;
    private long weight;
    
    public void mostrarDatos(){
        System.out.println("name = " + name);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        for (int i = 0; i < stats.size(); i++) {
            if( i < 3 ){
            System.out.println("stats[" + (i+1) + "] = " + stats.get(i).getStat().getName());
                System.out.println("baseStats[" + (i+1) + "] = " + stats.get(i).getBaseStat());

            }
        }
    }
}

@lombok.Data
class Ability {
    private Species ability;
    private boolean isHidden;
    private long slot;
}

@lombok.Data
class Species {
    private String name;
    private String url;
}

@lombok.Data
class Cries {
    private String latest;
    private String legacy;
}

@lombok.Data
class GameIndex {
    private long gameIndex;
    private Species version;
}

@lombok.Data
class HeldItem {
    private Species item;
    private List<VersionDetail> versionDetails;
}

@lombok.Data
class VersionDetail {
    private long rarity;
    private Species version;
}

@lombok.Data
class Move {
    private Species move;
    private List<VersionGroupDetail> versionGroupDetails;
}

@lombok.Data
class VersionGroupDetail {
    private long levelLearnedAt;
    private Species moveLearnMethod;
    private Long order;
    private Species versionGroup;
}

@lombok.Data
class PastAbility {
    private List<Ability> abilities;
    private Species generation;
}

@lombok.Data
class PastStat {
    private Species generation;
    private List<Stat> stats;
}

@lombok.Data
class Stat {
    private long baseStat;
    private long effort;
    private Species stat;
}

@lombok.Data
class GenerationV {
    private Sprites blackWhite;
}

@lombok.Data
class GenerationIv {
    private Sprites diamondPearl;
    private Sprites heartgoldSoulsilver;
    private Sprites platinum;
}
@lombok.Data
class Versions {
    private GenerationI generationI;
    private GenerationIi generationIi;
    private GenerationIii generationIii;
    private GenerationIv generationIv;
    private GenerationIx generationIx;
    private GenerationV generationV;
    private Map<String, Home> generationVi;
    private GenerationVii generationVii;
    private GenerationViii generationViii;
}
@lombok.Data
class Other {
    private DreamWorld dreamWorld;
    private Home home;
    private OfficialArtwork officialArtwork;
    private Sprites showdown;
}

@lombok.Data
class Sprites {
    private String backDefault;
    private String backFemale;
    private String backShiny;
    private String backShinyFemale;
    private String frontDefault;
    private String frontFemale;
    private String frontShiny;
    private String frontShinyFemale;
    private Other other;
    private Versions versions;
    private Sprites animated;
}

@lombok.Data
class GenerationI {
    private RedBlue redBlue;
    private RedBlue yellow;
}

@lombok.Data
class RedBlue {
    private String backDefault;
    private String backGray;
    private String backTransparent;
    private String frontDefault;
    private String frontGray;
    private String frontTransparent;
}

@lombok.Data
class GenerationIi {
    private Crystal crystal;
    private Gold gold;
    private Gold silver;
}

@lombok.Data
class Crystal {
    private String backDefault;
    private String backShiny;
    private String backShinyTransparent;
    private String backTransparent;
    private String frontDefault;
    private String frontShiny;
    private String frontShinyTransparent;
    private String frontTransparent;
}

@lombok.Data
class Gold {
    private String backDefault;
    private String backShiny;
    private String frontDefault;
    private String frontShiny;
    private String frontTransparent;
}

@lombok.Data
class GenerationIii {
    private OfficialArtwork emerald;
    private Gold fireredLeafgreen;
    private Gold rubySapphire;
}

@lombok.Data
class OfficialArtwork {
    private String frontDefault;
    private String frontShiny;
}

@lombok.Data
class GenerationIx {
    private DreamWorld scarletViolet;
}

@lombok.Data
class DreamWorld {
    private String frontDefault;
    private String frontFemale;
}

@lombok.Data
 class Home {
    private String frontDefault;
    private String frontFemale;
    private String frontShiny;
    private String frontShinyFemale;
}

@lombok.Data
 class GenerationVii {
    private DreamWorld icons;
    private Home ultraSunUltraMoon;
}

@lombok.Data
class GenerationViii {
    private DreamWorld brilliantDiamondShiningPearl;
    private DreamWorld icons;
}

@lombok.Data
class Type {
    private long slot;
    private Species type;
}
