/*
 * Copyright (c) 2012-2017 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.infrastructure.docker.client.exception;

/**
 * Occurs when docker exec is not found.
 *
 * @author Alexander Garagatyi
 */
public class ExecNotFoundException extends DockerException {

  public ExecNotFoundException(String message) {
    super(message, 404);
  }
}
