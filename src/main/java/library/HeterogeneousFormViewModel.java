package library;

import java.util.HashMap;

public interface HeterogeneousFormViewModel extends CommonFormViewModel{
    HashMap<String, Double> getInputFieldWidths();
    HashMap<String, Double> getInputFieldHeights();
}
