package net.eviden.annotations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

@Aspect

@Component
public class AspectoAfter {
	private static final Logger log = LogManager.getLogger(AspectoAfter.class);

	@After ("execution(* *(..)) && @annotation(anotacion)")
	public void cambiaTamanyo(JoinPoint p,LimitChar anotacion) {
	
		log.info("CALLING AFTER ASPECT");
		Class clase = p.getTarget().getClass();
		Field f = ReflectionUtils.findField(clase, anotacion.campo());
		ReflectionUtils.makeAccessible(f);
		String campo = (String)ReflectionUtils.getField(f, p.getTarget());
		if (campo.length()<anotacion.size()) campo = String.format("%1$-"+anotacion.size()+"s",campo);
		ReflectionUtils.setField(f, p.getTarget(), campo);
		
	}
	
}
