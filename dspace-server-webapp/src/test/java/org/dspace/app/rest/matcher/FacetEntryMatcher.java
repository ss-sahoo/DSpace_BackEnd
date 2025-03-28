/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.app.rest.matcher;

import static com.jayway.jsonpath.matchers.JsonPathMatchers.hasJsonPath;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import org.hamcrest.Matcher;
import org.hamcrest.core.AnyOf;

public class FacetEntryMatcher {

    private FacetEntryMatcher() {
    }

    public static Matcher<? super Object> authorFacet(boolean hasNext) {
        return allOf(
            hasJsonPath("$.name", is("author")),
            hasJsonPath("$.facetType", is("text")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/author")),
            hasJsonPath("$._links", matchNextLink(hasNext, "api/discover/facets/author"))
        );
    }

    public static Matcher<? super Object> authorFacetWithMinMax(boolean hasNext, String min, String max) {
        return allOf(
            hasJsonPath("$.name", is("author")),
            hasJsonPath("$.facetType", is("text")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.minValue", is(min)),
            hasJsonPath("$.maxValue", is(max)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/author")),
            hasJsonPath("$._links", matchNextLink(hasNext, "api/discover/facets/author"))
        );
    }

    public static Matcher<? super Object> subjectFacet(boolean hasNext) {
        return allOf(
            hasJsonPath("$.name", is("subject")),
            hasJsonPath("$.facetType", is("hierarchical")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/subject")),
            hasJsonPath("$._links", matchNextLink(hasNext, "api/discover/facets/subject"))

        );
    }

    public static Matcher<? super Object> submitterFacet(boolean hasNext) {
        return allOf(
            hasJsonPath("$.name", is("submitter")),
            hasJsonPath("$.facetType", is("authority")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/submitter")),
            hasJsonPath("$._links", matchNextLink(hasNext, "api/discover/facets/submitter"))

        );
    }

    public static Matcher<? super Object> supervisedByFacet(boolean hasNext) {
        return allOf(
            hasJsonPath("$.name", is("supervisedBy")),
            hasJsonPath("$.facetType", is("authority")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/supervisedBy")),
            hasJsonPath("$._links", matchNextLink(hasNext, "api/discover/facets/supervisedBy"))

        );
    }

    public static Matcher<? super Object> dateIssuedFacet(boolean hasNext) {
        return allOf(
            hasJsonPath("$.name", is("dateIssued")),
            hasJsonPath("$.facetType", is("date")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/dateIssued")),
            hasJsonPath("$._links", matchNextLink(hasNext, "api/discover/facets/dateIssued"))
        );
    }

    public static Matcher<? super Object> dateIssuedFacetWithMinMax(boolean hasNext, String min, String max) {
        return allOf(
            hasJsonPath("$.name", is("dateIssued")),
            hasJsonPath("$.facetType", is("date")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.minValue", is(min)),
            hasJsonPath("$.maxValue", is(max)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/dateIssued")),
            hasJsonPath("$._links", matchNextLink(hasNext, "api/discover/facets/dateIssued"))
        );
    }

    public static Matcher<? super Object> hasContentInOriginalBundleFacet(boolean hasNext) {
        return allOf(
            hasJsonPath("$.name", is("has_content_in_original_bundle")),
            hasJsonPath("$.facetType", is("standard")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/has_content_in_original_bundle")),
            hasJsonPath("$._links", matchNextLink(hasNext, "api/discover/facets/has_content_in_original_bundle"))
        );
    }

    public static Matcher<? super Object> matchFacet(boolean hasNext, String name, String facetType) {
        return allOf(
                hasJsonPath("$.name", is(name)),
                hasJsonPath("$.facetType", is(facetType)),
                hasJsonPath("$.facetLimit", any(Integer.class)),
                hasJsonPath("$.openByDefault", any(Boolean.class)),
                hasJsonPath("$._links.self.href", containsString("api/discover/facets/" + name)),
                hasJsonPath("$._links", matchNextLink(hasNext, "api/discover/facets/" + name))
        );
    }


    /**
     * Check that a facet over the dc.type exists and match the default configuration
     * 
     * @param b
     *            true if we expect more values
     * @return a Matcher
     */
    public static Matcher<? super Object> typeFacet(boolean b) {
        return allOf(
                hasJsonPath("$.name", is("itemtype")),
                hasJsonPath("$.facetType", is("text")),
                hasJsonPath("$.facetLimit", any(Integer.class)),
                hasJsonPath("$.openByDefault", any(Boolean.class)),
                hasJsonPath("$._links.self.href", containsString("api/discover/facets/itemtype")),
                hasJsonPath("$._links", matchNextLink(b, "api/discover/facets/itemtype"))
            );
    }

    /**
     * Check that a facet over the object type (workspaceitem, workflowitem, etc.) exists and match the default
     * configuration
     * 
     * @param b
     *            true if we expect more values
     * @return a Matcher
     */
    public static Matcher<? super Object> resourceTypeFacet(boolean b) {
        return allOf(
                hasJsonPath("$.name", is("namedresourcetype")),
                hasJsonPath("$.facetType", is("authority")),
                hasJsonPath("$.facetLimit", any(Integer.class)),
                hasJsonPath("$.openByDefault", any(Boolean.class)),
                hasJsonPath("$._links.self.href", containsString("api/discover/facets/namedresourcetype")),
                hasJsonPath("$._links", matchNextLink(b, "api/discover/facets/namedresourcetype"))
            );
    }

    private static AnyOf<? super Object> matchNextLink(boolean hasNext, String path) {

        return anyOf(hasJsonPath("$.next.href", containsString(path)),
                           not(hasJsonPath("$.next.href", containsString(path))));
    }
    public static Matcher<? super Object> entityTypeFacet(boolean hasNext) {
        return allOf(
            hasJsonPath("$.name", is("entityType")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/entityType")),
            hasJsonPath("$._links", matchNextLink(hasNext, "api/discover/facets/entityType"))
        );
    }

    public static Matcher<? super Object> relatedItemFacet(boolean b) {
        return allOf(
            hasJsonPath("$.name", is("relateditem")),
            hasJsonPath("$.facetType", is("text")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/relateditem")),
            hasJsonPath("$._links", matchNextLink(b, "api/discover/facets/relateditem"))
        );
    }

    public static Matcher<? super Object> originFacet(boolean b) {
        return allOf(
            hasJsonPath("$.name", is("origin")),
            hasJsonPath("$.facetType", is("text")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/origin")),
            hasJsonPath("$._links", matchNextLink(b, "api/discover/facets/origin"))
        );
    }

    public static Matcher<? super Object> targetFacet(boolean b) {
        return allOf(
            hasJsonPath("$.name", is("target")),
            hasJsonPath("$.facetType", is("text")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/target")),
            hasJsonPath("$._links", matchNextLink(b, "api/discover/facets/target"))
        );
    }

    public static Matcher<? super Object> queueStatusFacet(boolean b) {
        return allOf(
            hasJsonPath("$.name", is("queue_status")),
            hasJsonPath("$.facetType", is("text")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/queue_status")),
            hasJsonPath("$._links", matchNextLink(b, "api/discover/facets/queue_status"))
        );
    }

    public static Matcher<? super Object> activityStreamTypeFacet(boolean b) {
        return allOf(
            hasJsonPath("$.name", is("activity_stream_type")),
            hasJsonPath("$.facetType", is("text")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/activity_stream_type")),
            hasJsonPath("$._links", matchNextLink(b, "api/discover/facets/activity_stream_type"))
        );
    }

    public static Matcher<? super Object> coarNotifyTypeFacet(boolean b) {
        return allOf(
            hasJsonPath("$.name", is("coar_notify_type")),
            hasJsonPath("$.facetType", is("text")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/coar_notify_type")),
            hasJsonPath("$._links", matchNextLink(b, "api/discover/facets/coar_notify_type"))
        );
    }

    public static Matcher<? super Object> notificationTypeFacet(boolean b) {
        return allOf(
            hasJsonPath("$.name", is("notification_type")),
            hasJsonPath("$.facetType", is("text")),
            hasJsonPath("$.facetLimit", any(Integer.class)),
            hasJsonPath("$.openByDefault", any(Boolean.class)),
            hasJsonPath("$._links.self.href", containsString("api/discover/facets/notification_type")),
            hasJsonPath("$._links", matchNextLink(b, "api/discover/facets/notification_type"))
        );
    }

}
