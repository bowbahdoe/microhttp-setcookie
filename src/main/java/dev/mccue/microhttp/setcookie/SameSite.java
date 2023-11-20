package dev.mccue.microhttp.setcookie;

public enum SameSite {
    STRICT("Strict"),
    LAX("Lax"),
    NONE("None");

    final String value;

    SameSite(String value) {
        this.value = value;
    }
}

