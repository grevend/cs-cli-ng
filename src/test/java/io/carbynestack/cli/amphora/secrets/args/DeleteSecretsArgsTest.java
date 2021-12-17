/*
 * Copyright (c) 2021 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository https://github.com/carbynestack/cli-ng.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package io.carbynestack.cli.amphora.secrets.args;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class DeleteSecretsArgsTest {
    @Test
    void constructor() {
        var secrets = new UUID[] {
                UUID.randomUUID(),
                UUID.randomUUID()
        };
        assertThat(new DeleteSecretsArgs(secrets)
                .secrets()).isEqualTo(secrets);
    }

    @Test
    void constructorNullableValue() {
        assertThatThrownBy(() -> new DeleteSecretsArgs(null))
                .isExactlyInstanceOf(NullPointerException.class);
    }
}
