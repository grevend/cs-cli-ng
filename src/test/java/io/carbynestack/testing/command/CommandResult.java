/*
 * Copyright (c) 2021 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository https://github.com/carbynestack/cli-ng.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package io.carbynestack.testing.command;

/**
 * Represents an aggregation of a command execution test case generated by {@link CommandSource}.
 * The summation comprises the exit code, command output, and encountered errors.
 *
 * @param exitCode The exit code of the executed command.
 * @param out      The output of the executed command.
 * @param err      The encountered errors of the executed command.
 * @since 0.1.0
 */
public record CommandResult(int exitCode, String out, String err) {}
