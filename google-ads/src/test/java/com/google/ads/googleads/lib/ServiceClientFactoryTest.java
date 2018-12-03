package com.google.ads.googleads.lib;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ServiceClientFactoryTest {
  /** Verifies that all GrpcServiceDescriptor classes are in ServiceClientFactory. */
  @Test
  public void serviceClientFactory_containsAll_grpcServiceDescriptors() {
    Set<? extends Class<?>> missingReturnTypes =
        Stream.of(ServiceClientFactory.class.getMethods())
            .map(method -> method.getReturnType())
            .filter(
                returnType ->
                    !GrpcServiceDescriptor.getAllServiceClientClasses().contains(returnType))
            .collect(Collectors.toSet());
    assertThat(missingReturnTypes, is(empty()));
  }
}
