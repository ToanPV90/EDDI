package ai.labs.eddi.modules.nlp.extensions.normalizers.providers;


import ai.labs.eddi.modules.nlp.extensions.normalizers.INormalizer;
import ai.labs.eddi.modules.nlp.extensions.normalizers.RemoveUndefinedCharacterNormalizer;

import java.util.Map;

public class RemoveUndefinedCharacterNormalizerProvider implements INormalizerProvider {
    public static final String ID = "ai.labs.parser.normalizers.allowedCharacter";

    @Override
    public String getId() {
        return ID;
    }

    @Override
    public String getDisplayName() {
        return "Remove Undefined Character Normalizer";
    }

    @Override
    public INormalizer provide(Map<String, Object> config) {
        return new RemoveUndefinedCharacterNormalizer();
    }
}
