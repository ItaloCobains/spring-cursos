package br.italocobains.cursosapi.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

  private MessageSource messageSource;

  public ExceptionHandlerController(MessageSource messageSource) {
    this.messageSource = messageSource;
  }

  @SuppressWarnings("null")
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<List<ErrorMessageDTO>> handleMethodArgumentNotValidException(
      MethodArgumentNotValidException e) {
    List<ErrorMessageDTO> dto = new ArrayList<>();
    e.getBindingResult().getAllErrors().forEach(error -> {
      String message = messageSource.getMessage(error, LocaleContextHolder.getLocale());
      ErrorMessageDTO err = new ErrorMessageDTO(message, error.getObjectName());
      dto.add(err);
    });

    return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
  }
}
