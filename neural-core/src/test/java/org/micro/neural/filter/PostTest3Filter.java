package org.micro.neural.filter;

import org.micro.neural.extension.Extension;

@Extension(category = FilterChain.POST, order = 3)
public class PostTest3Filter extends Filter<Message> {
	
	@Override
	public void doFilter(Chain<Message> chain, Message m) throws Exception {
		System.out.println(this.getClass().getName());
		chain.doFilter(chain, m);
	}

}
