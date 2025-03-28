package ru.dancrise.domain.utility;

import java.util.Objects;

public final class ValidationUtil {
  private ValidationUtil() {}

  public static void validateNotEmpty(String variableUnderValidation, String errorMessage) {
    if (Objects.isNull(variableUnderValidation) || variableUnderValidation.isEmpty()) {
      throw new IllegalArgumentException(errorMessage);
    }
  }
}
