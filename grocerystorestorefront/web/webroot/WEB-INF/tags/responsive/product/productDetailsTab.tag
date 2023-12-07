<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="product" required="true" type="de.hybris.platform.commercefacades.product.data.ProductData"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<div class="tab-details">
	<ycommerce:testId code="productDetails_content_label">
		<p>
		<b>About the Product:</b>
		<ul>
			<li>${ycommerce:sanitizeHTML(product.description)}</li>
			<li>Country of Origin : ${ycommerce:sanitizeHTML(product.countryOrigin)}</li>
			<li>Shelf Life : ${ycommerce:sanitizeHTML(product.shelfLife)}</li>
			<li>Brand Name : ${ycommerce:sanitizeHTML(product.brandName)}</li>
		</ul>
		<p>
	</ycommerce:testId>
</div>