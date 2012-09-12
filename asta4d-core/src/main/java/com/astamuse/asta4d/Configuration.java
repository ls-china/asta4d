package com.astamuse.asta4d;

import java.util.Arrays;
import java.util.List;

import com.astamuse.asta4d.data.ContextDataFinder;
import com.astamuse.asta4d.data.DefaultContextDataFinder;
import com.astamuse.asta4d.snippet.DefaultSnippetInvoker;
import com.astamuse.asta4d.snippet.SnippetInvoker;
import com.astamuse.asta4d.snippet.extract.DefaultSnippetExtractor;
import com.astamuse.asta4d.snippet.extract.SnippetExtractor;
import com.astamuse.asta4d.snippet.resolve.DefaultSnippetResolver;
import com.astamuse.asta4d.snippet.resolve.SnippetResolver;
import com.astamuse.asta4d.template.FileTemplateResolver;
import com.astamuse.asta4d.template.TemplateResolver;

public class Configuration {

    private TemplateResolver templateResolver = new FileTemplateResolver();

    private SnippetInvoker snippetInvoker = new DefaultSnippetInvoker();

    private SnippetResolver snippetResolver = new DefaultSnippetResolver();

    private SnippetExtractor snippetExtractor = new DefaultSnippetExtractor();

    private ContextDataFinder contextDataFinder = new DefaultContextDataFinder();

    private boolean cacheEnable = true;

    /**
     * at present, the following items are regarded as global settings
     */
    private List<String> reverseInjectableScopes = Arrays.asList(Context.SCOPE_DEFAULT, Context.SCOPE_GLOBAL);

    private String tagNameSpace = "afd";

    public TemplateResolver getTemplateResolver() {
        return templateResolver;
    }

    public void setTemplateResolver(TemplateResolver templateResolver) {
        this.templateResolver = templateResolver;
    }

    public SnippetInvoker getSnippetInvoker() {
        return snippetInvoker;
    }

    public void setSnippetInvoker(SnippetInvoker snippetInvoker) {
        this.snippetInvoker = snippetInvoker;
    }

    public SnippetResolver getSnippetResolver() {
        return snippetResolver;
    }

    public void setSnippetResolver(SnippetResolver snippetResolver) {
        this.snippetResolver = snippetResolver;
    }

    public SnippetExtractor getSnippetExtractor() {
        return snippetExtractor;
    }

    public void setSnippetExtractor(SnippetExtractor snippetExtractor) {
        this.snippetExtractor = snippetExtractor;
    }

    public ContextDataFinder getContextDataFinder() {
        return contextDataFinder;
    }

    public void setContextDataFinder(ContextDataFinder contextDataFinder) {
        this.contextDataFinder = contextDataFinder;
    }

    public boolean isCacheEnable() {
        return cacheEnable;
    }

    public void setCacheEnable(boolean cacheEnable) {
        this.cacheEnable = cacheEnable;
    }

    public List<String> getReverseInjectableScopes() {
        return reverseInjectableScopes;
    }

    public void setReverseInjectableScopes(List<String> reverseInjectableScopes) {
        this.reverseInjectableScopes = reverseInjectableScopes;
    }

    public String getTagNameSpace() {
        return tagNameSpace;
    }

    public void setTagNameSpace(String tagNameSpace) {
        this.tagNameSpace = tagNameSpace;
    }

}
