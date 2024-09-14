package com.example;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

class OrderModelAssembler implements RepresentationModelAssembler<Order, EntityModel<Order>> {

    @Override
    public EntityModel<Order> toModel(Order entity) {
        EntityModel<Order> entityModel = EntityModel.of(entity,
                linkTo(methodOn(OrderController.class).one(entity.getId())).withSelfRel(),
                linkTo(methodOn(OrderController.class).all()).withRel("orders")
        );

        if (entity.getStatus() == Status.IN_PROGRESS) {
            entityModel.add(linkTo(methodOn(OrderController.class).cancel(entity.getId())).withRel("cancel"));
            entityModel.add(linkTo(methodOn(OrderController.class).complete(entity.getId())).withRel("complete"));
        }

        return entityModel;
    }
}
