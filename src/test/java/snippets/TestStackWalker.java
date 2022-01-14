package snippets;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static java.lang.StackWalker.Option.RETAIN_CLASS_REFERENCE;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestStackWalker {


    @Test
    void stackwalkerGetsPath() {
        // GIVEN: a stackwalker
        var walker = StackWalker.getInstance(RETAIN_CLASS_REFERENCE);

        // WHEN: i add the stack to a list
        var list = new ArrayList<String>();
        walker.forEach(f -> list.add(f.toString()));

        // THEN: the complete path is in that list
        for (String stackFrameLine : list) {
            assertTrue(stack.contains(stackFrameLine));
        }
    }


    static Set<String> stack = new HashSet<>();
    static {
        stack.add("snippets.TestStackWalker.stackwalkerGetsPath(TestStackWalker.java:22)");
        stack.add("org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:725)");
        stack.add("org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)");
        stack.add("org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)");
        stack.add("org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:149)");
        stack.add("org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:140)");
        stack.add("org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:84)");
        stack.add("org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)");
        stack.add("org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)");
        stack.add("org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)");
        stack.add("org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)");
        stack.add("org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)");
        stack.add("org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)");
        stack.add("org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)");
        stack.add("org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)");
        stack.add("org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:214)");
        stack.add("org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)");
        stack.add("org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:210)");
        stack.add("org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:135)");
        stack.add("org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:66)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)");
        stack.add("org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)");
        stack.add("org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)");
        stack.add("org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)");
        stack.add("java.base/java.util.ArrayList.forEach(ArrayList.java:1511)");
        stack.add("org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)");
        stack.add("org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)");
        stack.add("org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)");
        stack.add("org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)");
        stack.add("java.base/java.util.ArrayList.forEach(ArrayList.java:1511)");
        stack.add("org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)");
        stack.add("org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)");
        stack.add("org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)");
        stack.add("org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)");
        stack.add("org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)");
        stack.add("org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)");
        stack.add("org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)");
        stack.add("org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)");
        stack.add("org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:108)");
        stack.add("org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:88)");
        stack.add("org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:54)");
        stack.add("org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:67)");
        stack.add("org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:52)");
        stack.add("org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:96)");
        stack.add("org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:75)");
        stack.add("org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestClassProcessor$CollectAllTestClassesExecutor.processAllTestClasses(JUnitPlatformTestClassProcessor.java:99)");
        stack.add("org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestClassProcessor$CollectAllTestClassesExecutor.access$000(JUnitPlatformTestClassProcessor.java:79)");
        stack.add("org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestClassProcessor.stop(JUnitPlatformTestClassProcessor.java:75)");
        stack.add("org.gradle.api.internal.tasks.testing.SuiteTestClassProcessor.stop(SuiteTestClassProcessor.java:61)");
        stack.add("org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:36)");
        stack.add("org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)");
        stack.add("org.gradle.internal.dispatch.ContextClassLoaderDispatch.dispatch(ContextClassLoaderDispatch.java:33)");
        stack.add("org.gradle.internal.dispatch.ProxyDispatchAdapter$DispatchingInvocationHandler.invoke(ProxyDispatchAdapter.java:94)");
        stack.add("jdk.proxy1/jdk.proxy1.$Proxy2.stop(Unknown Source)");
        stack.add("org.gradle.api.internal.tasks.testing.worker.TestWorker$3.run(TestWorker.java:193)");
        stack.add("org.gradle.api.internal.tasks.testing.worker.TestWorker.executeAndMaintainThreadName(TestWorker.java:129)");
        stack.add("org.gradle.api.internal.tasks.testing.worker.TestWorker.execute(TestWorker.java:100)");
        stack.add("org.gradle.api.internal.tasks.testing.worker.TestWorker.execute(TestWorker.java:60)");
        stack.add("org.gradle.process.internal.worker.child.ActionExecutionWorker.execute(ActionExecutionWorker.java:56)");
        stack.add("org.gradle.process.internal.worker.child.SystemApplicationClassLoaderWorker.call(SystemApplicationClassLoaderWorker.java:133)");
        stack.add("org.gradle.process.internal.worker.child.SystemApplicationClassLoaderWorker.call(SystemApplicationClassLoaderWorker.java:71)");
        stack.add("worker.org.gradle.process.internal.worker.GradleWorkerMain.run(GradleWorkerMain.java:69)");
        stack.add("worker.org.gradle.process.internal.worker.GradleWorkerMain.main(GradleWorkerMain.java:74)");
    }
}
